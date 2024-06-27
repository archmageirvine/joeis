package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071066 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A071066() {
    super(1, NONCOMPUTABLE,
      Z.TWO,
      Z.valueOf(3002003),
      new Z("3303002003033"),
      new Z("9303303002003033039"),
      new Z("7609303303002003033039067"),
      new Z("3007609303303002003033039067003"),
      new Z("9003007609303303002003033039067003009"),
      new Z("3819003007609303303002003033039067003009183")
      );
  }

  // Following is code that searches, but this sequence is not really the best example

//  private static final Z[] MUL_TABLE = new Z[250];
//
//  static {
//    MUL_TABLE[1] = Z.valueOf(10000);
//    for (int k = 2; k < MUL_TABLE.length; ++k) {
//      MUL_TABLE[k] = MUL_TABLE[k - 1].multiply(1000000);
//    }
//  }
//
//  private List<Z> mBest = Collections.emptyList();
//
//  private void search(final List<Z> lst) {
//    final int n = lst.size();
//    if (n > mBest.size()) {
//      mBest = new ArrayList<>(lst);
//      System.out.println(lst);
//      System.out.println("New best: " + mBest.size());
//    }
//    final Z a = lst.get(n - 1).multiply(1000);
//    for (long k = 100; k < 1000; ++k) {
//      final Z t = MUL_TABLE[n].multiply(k).add(a).add(Functions.REVERSE.l(k));
//      if (t.isProbablePrime(2)) {
//        lst.add(t);
//        search(lst);
//        lst.remove(lst.size() - 1);
//      }
//    }
//  }
//
//  @Override
//  public Z next() {
//    final ArrayList<Z> lst = new ArrayList<>();
//    lst.add(Z.TWO);
////    // Seed the trace with known best solution
////    lst.add(Z.valueOf(3002003));
////    lst.add(new Z("3303002003033"));
////    lst.add(new Z("9303303002003033039"));
////    lst.add(new Z("7609303303002003033039067"));
////    lst.add(new Z("3007609303303002003033039067003"));
////    lst.add(new Z("9003007609303303002003033039067003009"));
////    lst.add(new Z("3819003007609303303002003033039067003009183"));
//    search(lst);
//    return null; // Sequence is finite
//  }
}
