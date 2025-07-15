package irvine.oeis.a078;

import irvine.oeis.InverseSequence;
import irvine.oeis.a064.A064389;

/**
 * A078758 Term in A064389 (variation (4) of Recam\u00e1n's sequence) where n appears, or 0 if n never appears.
 * @author Sean A. Irvine
 */
public class A078758 extends InverseSequence {

  /** Construct the sequence. */
  public A078758() {
    super(1, new A064389());
  }
}
