package irvine.oeis.a018;

/**
 * A018985 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite ATS = MAPO-36 H[ MgAl11P12O48 ].
 * @author Sean A. Irvine
 */
public class A018985 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // ATS
    return "a-1: c-12(00+) c-12(000) a-10(000) c-9(+00)\n"
      + "b-2: c-12(000) b-11(000) b-8(000) b-8(00-)\n"
      + "c-3: b-11(000) a-10(000) a-10(00-) a-7(0-0)\n"
      + "a-4: c-12(-00) c-9(000) c-9(00-) a-7(000)\n"
      + "b-5: b-11(00+) b-11(000) c-9(000) b-8(000)\n"
      + "c-6: a-10(0+0) b-8(000) a-7(00+) a-7(000)\n";
  }
}

