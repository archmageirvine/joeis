package irvine.oeis.a120;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120598 G.f. satisfies: 30*A(x) = 29 + 125*x + A(x)^5, starting with [1,5,10].
 * @author Georg Fischer
 */
public class A120598 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120598() {
    super(0, "[[0],[130528125,-192187500, 102343750,-23437500, 1953125],[77484375,-124790625, 73768750,-19031250, 1812500],[14759550,-27437625, 18859425,-5676750, 630750],[878004,-2195010, 1951120,-731670, 97556],[0, 61602,-112937, 61602,-10267]]", "1, 5, 10, 90", 0);
  }
}
