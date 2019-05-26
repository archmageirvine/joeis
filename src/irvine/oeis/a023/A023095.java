package irvine.oeis.a023;

/**
 * A023095 <code>a(n)</code> is the least k <code>&gt; 0</code> such that k and <code>3k</code> are anagrams in base <code>n</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023095 extends A023094 {

  @Override
  protected int multiple() {
    return 3;
  }
}
