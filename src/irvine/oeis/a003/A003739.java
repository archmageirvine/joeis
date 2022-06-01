package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A003739 Number of spanning trees in W_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003739() {
    super(new long[] {1, -1152, 80640, -1442883, 4477824, -4477824, 1442883, -80640, 1152},
      new Z[] {
        Z.valueOf(45),
        Z.valueOf(55125),
        Z.valueOf(59719680),
        Z.valueOf(64416925125L),
        Z.valueOf(69471840376125L),
        Z.valueOf(74922901143552000L),
        new Z("80801651828175064605"),
        new Z("87141671714980415665125"),
        new Z("93979154798291442260459520")}
    );
  }
}
