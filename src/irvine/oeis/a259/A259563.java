package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A259563.
 * @author Sean A. Irvine
 */
public class A259563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259563() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new Z[] {Z.ZERO, Z.ZERO, Z.valueOf(2571912), Z.valueOf(2472394752L), Z.valueOf(138662798400L), Z.valueOf(1666179072000L), Z.valueOf(-4637478825000L), Z.valueOf(-272992368918528L), Z.valueOf(-3187483870330368L), Z.valueOf(-23209723979366400L), Z.valueOf(-126970182577359000L), Z.valueOf(-566493158246400000L), Z.valueOf(-2161675076294530368L), Z.valueOf(-7278963158259007488L), new Z("-22112928086617859400"), new Z("-61611251010011136000")});
  }
}
