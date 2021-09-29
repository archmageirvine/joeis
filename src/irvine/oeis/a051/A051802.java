package irvine.oeis.a051;
// manually 2021-09-29

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A051802 Nonzero multiplicative digital root of n. 
 * @author Georg Fischer
 */
public class A051802 implements Sequence {

  protected long mN; // current index
  
  /** Construct the sequence. */
  public A051802() {
    mN = -1;
  }

  @Override
  public Z next() {
    return ZUtils.digitNZProductRoot(Z.valueOf(++mN));
  }
}
