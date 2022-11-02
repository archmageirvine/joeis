package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A111780 Seventh column (m=6) of unsigned triangle A111595.
 * @author Georg Fischer
 */
public class A111780 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111780() {
    super(6, "[[0],[-1, 1],[6],[6,-1]]", "1", 0);
    setGfType(1);
  }
}
