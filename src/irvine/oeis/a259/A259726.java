package irvine.oeis.a259;
// manually 2026-05-07

import irvine.math.cr.CR;
import irvine.oeis.FilterNumberSequence;

/**
 * A259726 Numbers k such that [r[s*k]] &gt; [s[r*k]], where r = sqrt(2), s=sqrt(3), and [ ] = floor.
 * @author Georg Fischer
 */
public class A259726 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A259726() {
    super(1, 1, k -> {
      final CR s = CR.THREE.sqrt();
      final CR r = CR.SQRT2;
      return r.multiply(s.multiply(k).floor()).floor().compareTo(s.multiply(r.multiply(k).floor()).floor()) > 0;
    });
  }
}
