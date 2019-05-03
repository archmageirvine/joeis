package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019193 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite MTW <code>= ZSM-12 Nan[ AlnSi28-nO56 ]</code>.
 * @author Sean A. Irvine
 */
public class A019193 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MTW
    return "a-1: f-13(0-0) f-13(-00) g-7(000) e-5(000)\n"
      + "e-5: c-10(0-0) c-10(-00) f-6(00+)\n"
      + "g-7: g-14(0-0) g-14(-00)\n"
      + "b-2: d-11(0-0) d-11(-00) c-10(--0) c-3(00+)\n"
      + "c-3: e-12(0-0) e-12(-00) b-9(--0)\n"
      + "d-11: g-14(000) f-13(000)\n"
      + "b-9: c-10(00-)\n"
      + "e-12: f-13(00-)\n"
      + "d-4: b-9(0-0) b-9(-00) g-7(000) f-6(000)\n"
      + "f-6: a-8(0-0) a-8(-00)\n"
      + "a-8: g-14(000) e-12(000)\n";
  }
}

