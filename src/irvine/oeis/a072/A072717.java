package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072717 Let <code>d(k)</code> be the sequence whose values are in <code>(1,2,3,4,5,6,7,8,9)</code> and are such that the continued fraction for the decimal number <code>D(n)=0.d(1)d(2)...d(n)</code> has strictly more elements than the continued fraction for <code>D(n-1)=0.d(1)d(2)...d(n-1)</code> and <code>d(n)</code> is as small as possible. Sequence gives values of <code>d(n)=a(n)</code> for <code>d(1)=1</code>.
 * @author Georg Fischer
 */
public class A072717 extends FiniteSequence {

  /** Construct the sequence. */
  public A072717() {
    super(1, 2, 3, 4, 7, 3, 1, 7, 7, 1, 1, 3, 7, 1, 2, 2, 7);
  }
}
