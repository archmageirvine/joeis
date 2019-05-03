package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A003745 Number of spanning trees in <code>(K_5 - e) X P_n</code>.
 * @author Sean A. Irvine
 */
public class A003745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003745() {
    super(new long[]{-1, 1645, -160129, 3747310, -7579606, 3747310, -160129, 1645},
      new Z[]{
        Z.valueOf(75),
        Z.valueOf(128625),
        Z.valueOf(199065600),
        Z.valueOf(307147367625L),
        Z.valueOf(473862674071875L),
        new Z("731065883885568000"),
        new Z("1127873690900648512275"),
        new Z("1740060755637940344737625")
      }
    );
  }
}
