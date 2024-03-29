package irvine.oeis.a075;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A075129 Binomial transform of reflected tetranacci numbers A074058: a(n)=Sum((-1)^k Binomial(n,k)*A074058(k),(k=0,..,n)).
 * @author Georg Fischer
 */
public class A075129 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A075129() {
    super(0, "[[0],[3],[-10],[10],[-5],[1]]", "[4, 5, 5, 5, 13]", 0);
  }
}
