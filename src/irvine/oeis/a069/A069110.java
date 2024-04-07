package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A069110 Squarefree part of F(n) (the Fibonacci numbers): the smallest number such that a(n)*F(n) is a square.
 * @author Sean A. Irvine
 */
public class A069110 extends Sequence1 {

  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    return Jaguar.factor(mF.next()).core();
  }
}

