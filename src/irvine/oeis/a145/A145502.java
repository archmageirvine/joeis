package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A145502 a(n+1)=a(n)^2+2*a(n)-2 and a(1)=2
 * @author Georg Fischer
 */
public class A145502 implements Sequence {

  private Z mA;

  /** Construct the sequence. */
  public A145502() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param parm
   */
  public A145502(final int start) {
    mA = Z.valueOf(start);
    ;
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = mA.multiply(mA).add(mA.multiply2()).subtract(2);
    return result;
  }
}
