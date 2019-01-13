package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Implements a two stage ECM factoring algorithm as described in Crandall
 * and Pomerance.
 *
 * @author Sean A. Irvine
 */
public class ECM extends AbstractFactorizer {

  /** First smoothness bound */
  //  private final long mB1;
  /** Second smoothness bound */
  //  private final long mB2;
  /** Curve parameter. */
  //  private final long mSigma;

  /**
   * Construct a new ECM factor machine with the specified bounds.
   *
   * @param b1 first smoothness bound
   * @param b2 second smoothness bound
   * @param sigma sigma
   */
  public ECM(final long b1, final long b2, final long sigma) {
    super();
    //    mB1 = b1;
    //    mB2 = b2;
    //    mSigma = sigma;
  }

  private Z ecm(final Z n) {
    // Construct the elliptic curve
    /*
    final Z sigma = Z.valueOf(mSigma);
    final Z u = sigma.square().add(-5).mod(n);
    final Z v = sigma.modMultiply(4, n);
    final Z vu = v.subtract(u);
    final Z u3 = u.multiply(u).multiply(u);
    final Z c = vu.multiply(vu).multiply(vu).multiply(u.multiply(3).add(v)).divide(u3.shiftLeft(2).multiply(v).add(-2)).mod(n);
    // c determines curve y^2 = x^3 + cx^2 + x
    // Do I need to keep num/den separate?

    final Z qx = u3.mod(n);
    final Z qz = v.multiply(v).modMultiply(v, n);
    */
    return null;
  }

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    final int exponent = fs.getExponent(n);
    final int status = fs.getStatus(n);
    fs.remove(n);
    n = AbstractFactorizer.handleEvenAndNegative(fs, n, exponent);
    if (n.equals(Z.ONE)) {
      return;
    }
    // ECM requires gcd(n,6)=1, hence remove multiples of 3 now, as we
    // have already done multiples of 2
    while (n.mod(3) == 0) {
      fs.add(3, FactorSequence.PRIME, 1);
      n = n.divide(3);
    }
    final Z f = ecm(n);
    if (f != null) {
      fs.add(f, exponent);
      fs.add(n.divide(f), exponent);
    } else {
      fs.add(n, status, exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments, printing a sorted list of factors.
   *
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    if (args.length == 0) {
      System.out.println("USAGE: ECM b1 b2 sigma n*");
    } else {
      final Factorizer f = new ECM(Long.parseLong(args[0]), Long.parseLong(args[1]), Long.parseLong(args[2]));
      f.setVerbose(true);
      for (int i = 3; i < args.length; ++i) {
        try {
          final FactorSequence fs = new FactorSequence(new Z(args[i]));
          f.factor(fs);
          System.out.println(fs.toString());
        } catch (final NumberFormatException e) {
          System.out.println("Could not parse " + args[i] + " as a number.");
        }
      }
    }
  }
}
