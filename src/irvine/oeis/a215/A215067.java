package irvine.oeis.a215;
// manually interleave at 2023-04-16 16:45

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a106.A106228;
import irvine.oeis.a109.A109081;

/**
 * A215067 Number of Motzkin n-paths avoiding odd-numbered steps that are up steps.
 * @author Georg Fischer
 */
public class A215067 extends AlternatingSequence {

  /** Construct the sequence. */
  public A215067() {
    super(0, new A106228(), new A109081());
    next();
  }
}
