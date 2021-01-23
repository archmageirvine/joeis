package irvine.oeis.a131;

import irvine.oeis.FiniteSequence;

/**
 * A131976 Let G be the full icosahedral group, of order 120. Let v_1, ..., v_20 be the vertices of the dodecahedron. Let S(n) be the set of vectors v_{i_1} + v_{i_2} + ... + v_{i_n} where 1 &lt;= i_1 &lt;= i_2 &lt;= ... &lt;= i_n &lt;= 20. Then a(n) = number of orbits of G on S(n).
 * @author Georg Fischer
 */
public class A131976 extends FiniteSequence {

  /** Construct the sequence. */
  public A131976() {
    super(1, 1, 5, 12, 22, 34, 50, 65, 78, 78, 86, 78, 78, 65, 50, 34, 22, 12, 5, 1, 1);
  }
}
