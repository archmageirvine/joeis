package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032143 Number of compound rooted windmills with n nodes where any 2 submills extending from the same node are of different sizes.
 * @author Sean A. Irvine
 */
public class A032143 extends MemorySequence {

  {
    add(null); // seq starts at 1
  }

  @Override
  protected Z computeNext() {
    if (size() < 4) {
      return Z.ONE;
    }
    return A032010.cfk(this).get(size() - 1);
  }
}
