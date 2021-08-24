package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347213.
 * @author Sean A. Irvine
 */
public class A347213 extends DecimalExpansionSequence {

  private static CR create(final int n) {
    CR t = Zeta.zeta(2);
    for (int k = 3; k <= n; ++k) {
      t = t.add(Zeta.zeta(k));
    }
    return t;
  }

  protected A347213(final int n) {
    super(create(n));
  }

  /** Construct the sequence. */
  public A347213() {
    this(3);
  }
}

