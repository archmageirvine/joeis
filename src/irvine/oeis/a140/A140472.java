package irvine.oeis.a140;

import irvine.oeis.PrependSequence;
import irvine.oeis.a109.A109168;

/**
 * A140472 Chaotic sequence related to A004001: a(n) = a(n - a(n-1)) + a(floor(n/2)).
 * @author Sean A. Irvine
 */
public class A140472 extends PrependSequence {

  /** Construct the sequence. */
  public A140472() {
    super(new A109168(), 0);
  }
}
