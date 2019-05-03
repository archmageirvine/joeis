package irvine.oeis.a131;

import irvine.oeis.FiniteSequence;

/**
 * A131976 Let G be the full icosahedral group, of order 120. Let <code>v_1</code>, ..., <code>v_20</code> be the vertices of the dodecahedron. Let <code>S(n)</code> be the set of vectors <code>v_{i_1} + v_{i_2} +</code> ... <code>+ v_{i_n}</code> where <code>1 &lt;= i_1 &lt;= i_2 &lt;=</code> ... <code>&lt;= i_n &lt;= 20</code>. Then <code>a(n) =</code> number of orbits of G on <code>S(n)</code>.
 * @author Georg Fischer
 */
public class A131976 extends FiniteSequence {

  /** Construct the sequence. */
  public A131976() {
    super(1, 1, 5, 12, 22, 34, 50, 65, 78, 78, 86, 78, 78, 65, 50, 34, 22, 12, 5, 1, 1);
  }
}
