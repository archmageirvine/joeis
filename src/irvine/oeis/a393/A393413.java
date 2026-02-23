package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393413 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A393413 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393413() {
    super(0, CR.valueOf(13).sqrt().add(3).divide(2).log10().multiply(2).inverse());
  }
}
