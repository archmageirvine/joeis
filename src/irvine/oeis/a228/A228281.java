package irvine.oeis.a228;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A228281 Number of nX6 binary arrays with top left value 1 and no two ones adjacent horizontally, vertically or nw-se diagonally.
 * Recurrence: a(n)=a(n-1)+42*a(n-2)+147*a(n-3)+70*a(n-4)-478*a(n-5)-449*a(n-6)+1199*a(n-7)+732*a(n-8)-2727*a(n-9)+659*a(n-10)+3827*a(n-11)-5776*a(n-12)+3926*a(n-13)-1152*a(n-14)-148*a(n-15)+154*a(n-16)+32*a(n-17)-29*a(n-18)-6*a(n-19)+3*a(n-20)+a(n-21)
 * @author Georg Fischer
 */
public class A228281 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A228281() {
    super(1, "[[0],[1],[3],[-6],[-29],[32],[154],[-148],[-1152],[3926],[-5776],[3827],[659],[-2727],[732],[1199],[-449],[-478],[70],[147],[42],[1],[-1]]", "8, 28, 337, 2448, 21166, 172082, 1428523, 11771298, 97268701, 802886174, 6629901197, 54739811878, 451976078779, 3731849749697, 30812948919061, 254414847888742, 2100639733295629, 17344457600010491, 143208852222784259, 1182439709334842998, 9763109223213679687, 80611553342643088177, 665589453485086586105, 5495605806230034338484, 45375843951619910281594, 374657005419531364228084, 3093449277978898840852013", 0);
  }
}
