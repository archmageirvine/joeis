package irvine.oeis.a089;
// Generated by gen_seq4.pl 2024-03-19/simtraf at 2024-03-19 22:04

import irvine.math.z.Z;
import irvine.oeis.a081.A081827;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A089029 a(n)=n if Hofstadter's Q-sequence increases A005185(n-1)-&gt;A005185(n), a(n)=1 otherwise.
 * @author Georg Fischer
 */
public class A089029 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A089029() {
    super(2, new A081827(), (n, v) -> Z.valueOf(v.compareTo(Z.ZERO) > 0 ? n : 1));
  }
}
