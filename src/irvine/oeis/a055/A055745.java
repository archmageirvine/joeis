package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055745 Squarefree numbers not of form ab + bc + ca for 1 &lt;= a &lt;= b &lt;= c (probably the list is complete).
 * @author Sean A. Irvine
 */
public class A055745 extends FiniteSequence {

  /** Construct the sequence. */
  public A055745() {
    super(1, 2, 6, 10, 22, 30, 42, 58, 70, 78, 102, 130, 190, 210, 330, 462);
  }
}
