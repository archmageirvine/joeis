package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a033.A033185;

/**
 * A029855 Number of rooted trees where root has degree 4.
 * @author Sean A. Irvine
 */
public class A029855 extends A033185 {

  /** Construct the sequence. */
  public A029855() {
    super(5);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN, 4);
  }
}
