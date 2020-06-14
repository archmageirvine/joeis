package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032309 "EFK" <code>(unordered</code>, size, unlabeled) transform of 2,4,6,8,...
 * @author Sean A. Irvine
 */
public class A032309 implements Sequence {

  private final List<Z> mA = new ArrayList<>();
  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    mA.add(Z.valueOf(mN));
    return A032306.efk(mA).coeff(mA.size() - 1);
  }
}
