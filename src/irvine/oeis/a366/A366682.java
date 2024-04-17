package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024127;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366682 Number of prime factors of 11^n - 1 (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A366682 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366682() {
    super(1, new A024127().skip(), k -> Functions.BIG_OMEGA.z(k));
  }
}

