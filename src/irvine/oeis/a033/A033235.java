package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033235 Primes of the form x^2 + 55*y^2.
 * @author Sean A. Irvine
 */
public class A033235 extends A000040 {

  protected int mParm;
  
  /** Construct the sequence */
  public A033235() {
    this(55);
  }
  
  /**
   * Generic constructor with parameter
   * @param parm factor of y^2
   */
  public A033235(final int parm) {
    mParm = parm;
  } 
  
  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z y2;
      for (Z x = Z.ONE; (y2 = x.square().multiply(mParm)).compareTo(p) <= 0; x = x.add(1)) {
        if (p.subtract(y2).isSquare()) {
          return p;
        }
      }
    }
  }
}
