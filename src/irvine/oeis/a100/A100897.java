package irvine.oeis.a100;
// manually 2021-05-29 

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A100897 a(n) is the decimal expansion of 7nn7.
 * @author Georg Fischer
 */
public class A100897 implements Sequence {

  private long mN;
  
  /** Construct the sequence. */
  public A100897() {
    mN = -1;
  }

  @Override
  public Z next() {
    final String mns = String.valueOf(++mN);
    return new Z("7" + mns + mns + "7");
  }
}
