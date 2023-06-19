package irvine.oeis.a121;
// manually 2023-06-19

import irvine.math.z.Z;
import irvine.oeis.a006.A006231;

/**
 * A121726 Sum sequence A000522 then subtract 0,1,2,3,4,5,...
 *
 * @author Georg Fischer
 */
public class A121726 extends A006231 {

  /** Construct the sequence. */
  public A121726() {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
