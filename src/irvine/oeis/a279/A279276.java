package irvine.oeis.a279;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A279276 Numbers k such that <code>2*k+1</code> and <code>7*k+1</code> are both pentagonal numbers (A000326).
 * @author Sean A. Irvine
 */
public class A279276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279276() {
    super(new long[] {1, -1, 0, 0, -650284185602L, 650284185602L, 0, 0, 1},
      new Z[] {Z.valueOf(25), Z.valueOf(2093), Z.valueOf(2413024782L), Z.valueOf(199383164500L), Z.valueOf(16474611689525L), Z.valueOf(1361262526857873L), new Z("1569151855418042668762"), new Z("129655718749849826609000"), new Z("10713179445632171628299025")});
  }
}
