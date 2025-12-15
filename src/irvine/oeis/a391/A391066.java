package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a019.A019565;
import irvine.oeis.a087.A087207;

/**
 * A391066 a(n) is the last term of the map x -&gt; A087207(x) starting with A019565(n) before reaching 1 or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A391066 extends Sequence1 {

  private final A087207 mS = new A087207();
  private final Sequence mA = new A019565().skip();

  @Override
  public Z next() {
    Z u = null;
    Z t = mA.next();
    while (!t.isOne()) {
      u = t;
      t = mS.a(t);
    }
    return u;
  }
}
