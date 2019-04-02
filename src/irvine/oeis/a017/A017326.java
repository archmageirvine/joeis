package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017326 a(n) = (10*n + 4)^10.
 * @author Sean A. Irvine
 */
public class A017326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017326() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(1048576), Z.valueOf(289254654976L), Z.valueOf(63403380965376L), Z.valueOf(2064377754059776L), Z.valueOf(27197360938418176L), Z.valueOf(210832519264920576L), Z.valueOf(1152921504606846976L), Z.valueOf(4923990397355877376L), new Z("17490122876598091776"), new Z("53861511409489970176"), new Z("148024428491834392576")});
  }
}
