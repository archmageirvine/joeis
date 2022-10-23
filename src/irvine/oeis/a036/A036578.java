package irvine.oeis.a036;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036578 Ternary Thue-Morse sequence: closed under a-&gt;abc, b-&gt;ac, c-&gt;b.
 * @author Sean A. Irvine
 */
public class A036578 extends Sequence0 {

  private final LinkedList<Integer> mA = new LinkedList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(0);
      mA.add(2);
      return Z.ONE;
    }
    final int res = mA.pollFirst();
    switch (res) {
      case 0:
        mA.add(1);
        mA.add(2);
        break;
      case 1:
        mA.add(1);
        mA.add(0);
        mA.add(2);
        break;
      case 2:
        mA.add(0);
        break;
      default:
        throw new RuntimeException();
    }
    return Z.valueOf(res);
  }
}
