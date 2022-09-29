package irvine.oeis.a059;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059521 a(1) = 5; thereafter write the cubes of each element in order.
 * @author Sean A. Irvine
 */
public class A059521 implements Sequence {

  private final LinkedList<Integer> mA = new LinkedList<>();
  {
    mA.add(5);
  }

  @Override
  public Z next() {
    final int t = mA.pollFirst();
    switch (t) {
      case 1:
        mA.add(1);
        break;
      case 2:
        mA.add(8);
        break;
      case 5:
        mA.add(1);
        mA.add(2);
        mA.add(5);
        break;
      case 8:
        mA.add(5);
        mA.add(1);
        mA.add(2);
        break;
      default:
        throw new RuntimeException();
    }
    return Z.valueOf(t);
  }
}
