package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A060129 Number of moved (non-fixed) elements in the permutation with rank number n in lists A060117 (or in A060118), i.e., the sum of the lengths of all cycles larger than one in that permutation.
 * @author Sean A. Irvine
 */
public class A060129 extends Sequence0 {

  private final Sequence mA = new A060128();
  private final Sequence mB = new A060130();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
