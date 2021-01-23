package irvine.oeis.a005;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005678 A squarefree ternary sequence.
 * @author Sean A. Irvine
 */
public class A005678 implements Sequence {

  private final LinkedList<Integer> mA = new LinkedList<>();
  private int mPrev = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(2);
      mA.add(1);
      mA.add(3);
      return Z.ONE;
    }
    final int res = mA.pollFirst();
    switch (res) {
      case 1:
        mA.add(1);
        mA.add(2);
        mA.add(1);
        mA.add(3);
        break;
      case 2:
        mA.add(2);
        mA.add(1);
        mA.add(2);
        mA.add(3);
        break;
      case 3:
        if (mPrev == 1) {
          mA.add(2);
          mA.add(3);
          mA.add(1);
          mA.add(3);
        } else {
          mA.add(1);
          mA.add(3);
          mA.add(2);
          mA.add(3);
        }
        break;
      default:
        throw new RuntimeException();
    }
    mPrev = res;
    return Z.valueOf(res);
  }
}
