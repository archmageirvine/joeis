package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019117 Cycle class sequence <code>c(n) (the</code> number of true cycles of length n in which a certain node is included) for zeolite EPI = Epistilbite <code>Ca3 [ Al6Si18O48 ] . 16 H2O</code>.
 * @author Sean A. Irvine
 */
public class A019117 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // EPI
    return "a-1: c-12(0-0) a-7(0-0) a-4(000) b-2(0-0)\n"
      + "b-2: b-11(-+0) b-5(00+) c-3(-00)\n"
      + "a-4: a-10(+00) c-9(+00) b-5(+00)\n"
      + "a-7: a-10(000) b-8(0+0)\n"
      + "c-3: a-10(+00) c-9(+0+) c-6(00+)\n"
      + "b-5: b-8(-+0) c-6(0+0)\n"
      + "b-11: c-12(0-0)\n"
      + "c-6: c-12(0--) a-7(0-0)\n"
      + "c-9: c-12(00-)\n"
      + "a-10: b-11(-00)\n"
      + "b-8: b-11(00-) c-9(+00)\n";
  }
}

