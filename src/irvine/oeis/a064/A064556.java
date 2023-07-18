package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A064552.
 * @author Sean A. Irvine
 */
public class A064556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064556() {
    super(0,
      new Z[] {new Z("-10000000000000000000000"), new Z("-11592000000000000"), Z.valueOf(124097412800L), Z.valueOf(-115920)},
      new Z[] {Z.ONE, Z.valueOf(-115920), Z.valueOf(37534859200L), new Z("-30328412970240000")}
    );
  }
}

