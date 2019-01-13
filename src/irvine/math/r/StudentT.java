package irvine.math.r;

/**
 * Student-t distribution.
 * @author Sean A. Irvine
 */
public final class StudentT  {

  private StudentT() { }

  /**
   * Compute the integral from minus infinity to t of the Student t
   * distribution with integer k&gt;0 degrees of freedom.
   * @param k degrees of freedom
   * @param t parameter
   * @return Student t value
   */
  public static double studentT(final int k, final double t) {
    if (k <= 0) {
      return Double.NaN; // faulty degrees of freedom
    } else if (t == 0.0) {
      return 0.5;
    }
    final double dk = k;
    if (t < -2.0) {
      return 0.5 * Beta.ibeta(0.5 * dk, 0.5, dk / (dk + t * t));
    }
    // compute integral from -t to +t
    final double x = Math.abs(t);
    final double z = 1.0 + (x * x) / dk;
    double f = 1.0;
    double tz = 1.0;
    double p;
    if ((k & 1) != 0) {
      final double xsqk = x / Math.sqrt(dk);
      p = Math.atan(xsqk);
      if (k > 1) {
        int j = 3;
        while (j <= k - 2 && tz / f > Constants.MACHINE_PRECISION) {
          tz *= (j - 1) / (z * j);
          f += tz;
          j += 2;
        }
        p += f * xsqk / z;
      }
      p *= 2.0 / Math.PI;
    } else {
      int j = 2;
      while (j <= k - 2 && tz / f > Constants.MACHINE_PRECISION) {
        tz *= (j - 1) / (z * j);
        f += tz;
        j += 2;
      }
      p = f * x / Math.sqrt(z * dk);
    }
    if (t < 0.0) {
      p = -p;
    }
    return 0.5 + 0.5 * p;
  }

  /**
   * Given a probability p and k degrees of freedom, compute a value t
   * such that <code>studentt(k,t)=p</code>. That is, an inverse of the student-t function.
   * @param k degrees of freedom (k &gt; 0)
   * @param p probability (0 &lt; p &lt; 1)
   * @return t value
   */
  public static double inverseStudentT(final int k, double p) {
    if (k <= 0 || p <= 0.0 || p >= 1.0) {
      return Double.NaN; // parameter range error
    }
    final double dk = k;
    if (p > 0.25 && p < 0.75) {
      if (p == 0.5) {
        return 0;
      }
      double z = Beta.inverseibeta(0.5, 0.5 * dk, Math.abs(1.0 - 2.0 * p));
      z = Math.sqrt(dk * z / (1.0 - z));
      return p < 0.5 ? -z : z;
    }
    boolean rflg = false;
    if (p >= 0.5) {
      p = 1 - p;
      rflg = true;
    }
    double t = Beta.inverseibeta(0.5 * dk, 0.5, 2.0 * p);
    if (Double.MAX_VALUE * t < dk) {
      return rflg ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
    }
    t = Math.sqrt(dk / t - dk);
    return rflg ? t : -t;
  }

}
