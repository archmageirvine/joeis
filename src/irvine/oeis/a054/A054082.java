package irvine.oeis.a054;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a026.A026355;
import irvine.oeis.a026.A026356;

/**
 * A054082 Permutation of N: a(1)=2, a(2)=1 and for each k &gt;= 2, let p(k)=least natural number not already an a(i), q(k)=p(k)+k-1, a(2k-1)=q(k), a(2k)=p(k).
 * @author Sean A. Irvine
 */
public class A054082 extends AlternatingSequence {

  /** Construct the sequence. */
  public A054082() {
    super(new A026356(), new PrependSequence(new SkipSequence(new A026355(), 2), 1));
  }
}
