package irvine.oeis.a257;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A257715.
 * @author Sean A. Irvine
 */
public class A257715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257715() {
    super(new long[] {1, -1, 0, 0, 0, -885289046402L, 885289046402L, 0, 0, 0, 1},
      new Z[] {Z.valueOf(651), Z.valueOf(354051), Z.valueOf(196476315), Z.valueOf(1833809355), Z.valueOf(1017687528051L), Z.valueOf(564774036750651L), Z.valueOf(313425981747606051L), new Z("173938318056614696235"), new Z("1623451323680702588835"), new Z("900947621231988101541051"), new Z("499988268427580436128625651")});
  }
}
