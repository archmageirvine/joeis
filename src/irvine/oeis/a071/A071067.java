package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071067 extends FiniteSequence {

  /** Construct the sequence. */
  public A071067() {
    super(1, FINITE,
      Z.TWO,
      new Z("70207"),
      new Z("357020753"),
      new Z("9635702075369"),
      new Z("33963570207536933"),
      new Z("723396357020753693327"),
      new Z("1272339635702075369332721"),
      new Z("97127233963570207536933272179"),
      new Z("119712723396357020753693327217911"),
      new Z("9011971272339635702075369332721791109"),
      new Z("33901197127233963570207536933272179110933"),
      new Z("943390119712723396357020753693327217911093349"),
      new Z("3894339011971272339635702075369332721791109334983"),
      new Z("19389433901197127233963570207536933272179110933498391"),
      new Z("151938943390119712723396357020753693327217911093349839151"),
      new Z("7515193894339011971272339635702075369332721791109334983915157"),
      new Z("74751519389433901197127233963570207536933272179110933498391515747"),
      new Z("127475151938943390119712723396357020753693327217911093349839151574721"),
      new Z("3012747515193894339011971272339635702075369332721791109334983915157472103"),
      new Z("73301274751519389433901197127233963570207536933272179110933498391515747210337"),
      new Z("337330127475151938943390119712723396357020753693327217911093349839151574721033733"),
      new Z("9933733012747515193894339011971272339635702075369332721791109334983915157472103373399"),
      new Z("72993373301274751519389433901197127233963570207536933272179110933498391515747210337339927"),
      new Z("927299337330127475151938943390119712723396357020753693327217911093349839151574721033733992729"),
      new Z("1892729933733012747515193894339011971272339635702075369332721791109334983915157472103373399272981"),
      new Z("13189272993373301274751519389433901197127233963570207536933272179110933498391515747210337339927298131"));
  }


  // Following code will find the solution
//  private static final Z[] MUL_TABLE = new Z[250];
//  static {
//    MUL_TABLE[1] = Z.valueOf(1000);
//    for (int k = 2; k < MUL_TABLE.length; ++k) {
//      MUL_TABLE[k] = MUL_TABLE[k - 1].multiply(10000);
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
//    final Z a = lst.get(n - 1).multiply(100);
//    for (long k = 10; k < 100; ++k) {
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
//    lst.add(Z.valueOf(70207));
//    lst.add(Z.valueOf(357020753));
//    lst.add(new Z("9635702075369"));
//    search(lst);
//    return null; // Sequence is finite
//  }
}
