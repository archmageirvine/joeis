package irvine.oeis.a287;

import irvine.math.z.Z;
import irvine.oeis.a230.A230627;

/**
 * A287875 Iterate the map <code>x -&gt; A230625(x)</code> starting at n; sequence gives the first prime <code>(or 1)</code> that is reached, written in base 2, or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A287875 extends A230627 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return new Z(super.next().toString(2));
  }
}
