package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;

/**
 * A353306 Numbers k such that 1 is in the transitive closure of the map x -&gt; A353313(x) when starting iterating from x=k.
 * @author Gregory Morse
 */
public class A353306 extends FilterSequence {
  private static final A353305 ORBIT_MINIMUM = new A353305();

  /** Construct the sequence. */
  public A353306() {
    super(1, new A000027(), k -> Z.ONE.equals(ORBIT_MINIMUM.a(k)));
  }
}
