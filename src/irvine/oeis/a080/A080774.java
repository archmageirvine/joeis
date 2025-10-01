package irvine.oeis.a080;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002145;

/**
 * A080774 Numbers with two prime factors: (4*i+1)*(4*j+3).
 * @author Sean A. Irvine
 */
public class A080774 extends TwoParameterFormSequence {

  private static final DirectSequence A002144 = DirectSequence.create(new A002144());
  private static final DirectSequence A002145 = DirectSequence.create(new A002145());

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A080774(final int offset) {
    super(offset, 1, 1, (a, b) -> A002144.a(a.intValue()).multiply(A002145.a(b.intValue())));
  }

  /** Construct the sequence. */
  public A080774() {
    this(1);
  }
}
