package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310324 Coordination sequence Gal.6.80.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310324 extends TilingSequence {

  /** Construct the sequence. */
  public A310324() {
    super(0, new String[]
        { "6.6.6;B60+2,B60-2,C300+2"
        , "6.6.3.3;D60+2,A300+1,C60+1,E0+3"
        , "6.6.3.3;B300+3,A60+3,B300-3,E300+4"
        , "6.3.3.3.3;F60+2,B300+1,E300+2,F240+3,D180+5"
        , "3.3.3.3.3.3;F300+4,D60+3,B0+4,C60+4,B0-4,D300-3"
        , "6.3.3.3.3;D180-1,D300+1,D120+4,E60+1,D0-4"
        });
    defineBaseSet(0);
  }
}
