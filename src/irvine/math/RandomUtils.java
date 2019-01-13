package irvine.math;

import static java.lang.Math.exp;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Random;

/**
 * Utility functions associated with random numbers. Contains a number of
 * routines to generate random numbers for special distributions.  Most
 * of the methods are backed by an instance of the Java random number
 * generator.
 *
 * @author Sean A. Irvine
 */
public final class RandomUtils {

  private RandomUtils() { }

  /** Underlying random number generator. */
  private static final Random RANDOM = new Random();

  /**
   * Simulate rolling dice with the specified number of sides, summing the
   * result for each dice in the array.  A dice with <code>s</code> sides
   * is assumed to be labelled with 1, 2, 3, ..., <code>s</code>.  For
   * example, to simulate rolling two six-sided dice, pass the array
   * <code>new int[] {6, 6}</code> to this function.  High numbers of
   * dice or dice with ridiculous numbers of sides can cause the result to
   * overflow.
   *
   * @param sides array giving the number of sides on each dice.
   * @return the result of the roll
   * @exception NullPointerException is <code>sides</code> is null
   * @exception IllegalArgumentException if any array entry is less than 1.
   */
  public static int rollDice(final int... sides) {
    int r = sides.length;
    for (final int s : sides) {
      if (s <= 0) {
        throw new IllegalArgumentException();
      }
      r += RANDOM.nextInt(s);
    }
    return r;
  }

  /**
   * Generate a random number representing the number of successes drawn from
   * the binomial distribution with the specified number of trials and
   * probability. Handles the special case p=0 and p=1 exactly.
   *
   * @param trials number of trials
   * @param p probability of success on an individual trial
   * @return number of successes
   * @exception IllegalArgumentException if the probability p is invalid or
   * the number of trials is negative.
   */
  public static int binomial(final int trials, final double p) {
    if (trials < 0) {
      throw new IllegalArgumentException();
    }
    if (p <= 0) {
      if (p == 0) {
        return 0;
      }
      throw new IllegalArgumentException();
    } else if (p >= 1) {
      if (p == 1) {
        return trials;
      }
      throw new IllegalArgumentException();
    } else if (Double.isNaN(p)) {
      throw new IllegalArgumentException();
    }
    int s = 0;
    for (int i = 0; i < trials; ++i) {
      if (RANDOM.nextDouble() <= p) {
        ++s;
      }
    }
    return s;
  }

  /**
   * Generate a random number from a geometric distribution.
   *
   * @param p probability parameter
   * @return random value
   * @exception IllegalArgumentException if <code>p</code> is invalid.
   */
  public static int geometric(final double p) {
    if (p <= 0) {
      if (p == 0) {
        return 0;
      }
      throw new IllegalArgumentException();
    } else if (p >= 1) {
      if (p == 1) {
        return 0;
      }
      throw new IllegalArgumentException();
    } else if (Double.isNaN(p)) {
      throw new IllegalArgumentException();
    }
    return (int) (log(RANDOM.nextDouble()) / log(1 - p));
  }

  /**
   * Return a random value from a negative binomial distribution.
   *
   * @param r distribution parameter
   * @param p distribution probability
   * @return random value
   * @exception IllegalArgumentException if an invalid probability or nonpositive
   * <code>r</code> parameter is given.
   */
  public static int negativeBinomial(final int r, final double p) {
    if (r <= 0) {
      throw new IllegalArgumentException();
    }
    int s = 0;
    for (int i = 0; i < r; ++i) {
      s += geometric(p);
    }
    return s;
  }

  /**
   * Generate a random number from a Poisson distribution.
   *
   * @param lambda rate parameter
   * @return random value
   * @exception IllegalArgumentException if <code>lambda</code> is invalid.
   */
  public static int poisson(final double lambda) {
    if (lambda > 0) {
      final double a = exp(-lambda);
      double b = 1;
      int i = -1;
      do {
        ++i;
        b *= RANDOM.nextDouble();
      } while (b >= a);
      return i;
    }
    throw new IllegalArgumentException();
  }

  /**
   * Return a random deviate of the normal distribution with specified mean
   * and standard deviation.
   *
   * @param mu mean
   * @param sigma standard deviation
   * @return random value
   */
  public static double normal(final double mu, final double sigma) {
    return mu + sigma * RANDOM.nextGaussian();
  }

  /**
   * Return a random deviate of the lognormal distribution with specified mean
   * and standard deviation.
   *
   * @param mu mean
   * @param sigma standard deviation
   * @return random value
   */
  public static double lognormal(final double mu, final double sigma) {
    return exp(mu + sigma * RANDOM.nextGaussian());
  }

  /**
   * Return a random deviate of the exponential distribution with specified rate.
   *
   * @param lambda rate
   * @return random value
   */
  public static double exponential(final double lambda) {
    return -log(RANDOM.nextDouble()) / lambda;
  }

  /**
   * Return a random deviate of the Erlang distribution with specified shape
   * and rate.
   *
   * @param shape shape parameter
   * @param lambda rate parameter
   * @return random value
   * @exception IllegalArgumentException if <code>shape</code> or <code>lambda</code>
   * is nonpositive.
   */
  public static double erlang(final int shape, final double lambda) {
    if (shape > 0 && lambda > 0) {
      double r = 0;
      for (int i = 0; i < shape; ++i) {
        r -= log(RANDOM.nextDouble());
      }
      return r / lambda;
    }
    throw new IllegalArgumentException();
  }

  /**
   * Return a random deviate of the gamma distribution with specified shape
   * and scale.
   *
   * @param shape shape parameter
   * @param theta scale param
   * @return random value
   * @exception IllegalArgumentException if <code>shape</code> or <code>lambda</code>
   * is nonpositive.
   */
  public static double gamma(final double shape, final double theta) {
    if (shape > 0 && theta > 0) {
      if (shape < 1) {
        return gamma(shape + 1, theta) * pow(RANDOM.nextDouble(), 1 / shape);
      }
      final double d = shape - 1.0 / 3.0;
      final double c = 1 / sqrt(9 * d);
      while (true) {
        double x, v;
        do {
          x = RANDOM.nextGaussian();
          v = 1 + c * x;
        } while (v <= 0);
        v = v * v * v;
        final double u = RANDOM.nextDouble();
        final double x2 = x * x;
        if (u < 1 - 0.0331 * x2 * x2 || log(u) < 0.5 * x2 + d * (1 - v + log(v))) {
          return d * v * theta;
        }
      }
    }
    throw new IllegalArgumentException();
  }

  /**
   * Generate a random value from a beta distribution.
   *
   * @param alpha parameter
   * @param beta parameter
   * @return random value
   * @exception IllegalArgumentException if either parameter is nonpositive.
   */
  public static double beta(final double alpha, final double beta) {
    if (alpha > 0 && beta > 0) {
      final double y1 = gamma(alpha, 1);
      return y1 / (y1 + gamma(beta, 1));
    }
    throw new IllegalArgumentException();
  }

  /**
   * Generate a random value from a Weibull distribution.
   *
   * @param shape shape
   * @param scale scale
   * @return random value
   * @exception IllegalArgumentException if either parameter is nonpositive.
   */
  public static double weibull(final double shape, final double scale) {
    if (shape > 0 && scale > 0) {
      return scale * pow(-log(RANDOM.nextDouble()), 1 / shape);
    }
    throw new IllegalArgumentException();
  }

  /**
   * Generate a random value from a triangular distribution.
   *
   * @param a left end
   * @param b right end
   * @param c apex
   * @return random value
   * @exception IllegalArgumentException if <code>b&lt;=a</code> or
   * <code>c&lt;a</code> or <code>c&gt;b</code>.
   */
  public static double triangular(final double a, final double b, final double c) {
    if (b <= a || c < a || c > b) {
      throw new IllegalArgumentException();
    }
    final double cc = (c - a) / (b - a);
    final double u = RANDOM.nextDouble();
    if (u <= cc) {
      return a + sqrt(c * u);
    } else {
      return b - c * sqrt((1 - cc) * (1 - u));
    }
  }
}
