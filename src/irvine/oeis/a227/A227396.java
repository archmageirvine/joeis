package irvine.oeis.a227;
// manually tricut2 2023-07-31

import irvine.oeis.a014.A014410;
import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.triangle.PrependColumn;

/**
 * A227396 Triangle A074909(n) with the first column equal to 1 followed by -A000027(n) instead of A000012.
 * @author Georg Fischer
 */
public class A227396 extends PrependColumn {

  /** Construct the sequence. */
  public A227396() {
    super(0, new A014410(), new HolonomicRecurrence(0, "[-1,1,-1]", "[1,-1]", 0));
  }
}

