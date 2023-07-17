package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A050642 a(n+1) is next smallest nontrivial cube containing a(n) as a substring, initial term is 8.
 * @author Sean A. Irvine
 */
public class A050642 extends A000578 {

  /** Construct the sequence. */
  public A050642() {
    super(1);
  }

  {
    super.next(); // skip 0
    super.next(); // skip 1
  }

  private String mS = "";

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(10) != 0) {
        final String s = t.toString();
        if (s.contains(mS)) {
          mS = s;
          return t;
        }
      }
    }
  }
}
