package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A050646 a(n+1) is next smallest cube ending with a(n), initial term is 1.
 * @author Sean A. Irvine
 */
public class A050646 extends A000578 {

  /** Construct the sequence. */
  public A050646() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  private String mS = "";

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) != 0) {
        final String s = t.toString();
        if (s.endsWith(mS)) {
          mS = s;
          return t;
        }
      }
    }
  }
}
