package irvine.oeis.a036;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036586 Ternary Thue-Morse sequence: closed under a-&gt;abc, b-&gt;ac, c-&gt;b.
 * @author Sean A. Irvine
 */
public class A036586 extends Sequence0 {

  private final LinkedList<Integer> mA = new LinkedList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(0);
      mA.add(1);
      return Z.TWO;
    }
    final int res = mA.pollFirst();
    switch (res) {
      case 2:
        mA.add(2);
        mA.add(0);
        mA.add(1);
        break;
      case 1:
        mA.add(0);
        break;
      case 0:
        mA.add(2);
        mA.add(1);
        break;
      default:
        throw new RuntimeException();
    }
    return Z.valueOf(res);
  }
}
