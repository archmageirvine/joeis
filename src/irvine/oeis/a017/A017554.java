package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017554.
 * @author Sean A. Irvine
 */
public class A017554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017554() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {
        Z.valueOf(1024), Z.valueOf(289254654976L), Z.valueOf(141167095653376L), Z.valueOf(6278211847988224L), Z.valueOf(97656250000000000L), Z.valueOf(839299365868340224L), Z.valueOf(4923990397355877376L), new Z("22130157888803070976"), new Z("81707280688754689024"), new Z("259374246010000000000"), new Z("730463141542791783424")});
  }
}
